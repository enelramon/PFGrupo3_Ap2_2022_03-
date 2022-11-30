using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace EmpleosDoApi.Migrations
{
    public partial class inicio : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "Empleos",
                columns: table => new
                {
                    id = table.Column<int>(type: "INTEGER", nullable: false)
                        .Annotation("Sqlite:Autoincrement", true),
                    nombreVacante = table.Column<string>(type: "TEXT", nullable: true),
                    nombreEmpresa = table.Column<string>(type: "TEXT", nullable: true),
                    informacionVacante = table.Column<string>(type: "TEXT", nullable: true),
                    logoEmpresa = table.Column<string>(type: "TEXT", nullable: true),
                    requisitoVacante = table.Column<string>(type: "TEXT", nullable: true),
                    modalida = table.Column<string>(type: "TEXT", nullable: true),
                    tipo = table.Column<string>(type: "TEXT", nullable: true),
                    salario = table.Column<double>(type: "REAL", nullable: false),
                    paginaWeb = table.Column<string>(type: "TEXT", nullable: true),
                    ubicacion = table.Column<string>(type: "TEXT", nullable: true),
                    fechaPublicacion = table.Column<string>(type: "TEXT", nullable: true),
                    area = table.Column<string>(type: "TEXT", nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Empleos", x => x.id);
                });
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "Empleos");
        }
    }
}
