using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Windows.Input;
using System.ComponentModel.DataAnnotations;

namespace EmpleosDoApi.Model
{
    public class Empleos
    {
        [Key]
        public int id { get; set; }
        public string? nombreVacante { get; set; }
        public string? nombreEmpresa { get; set; }
        public string? informacionVacante { get; set; }
        public string? logoEmpresa { get; set; }
        public string? requisitoVacante { get; set; }
        public string? modalida { get; set; }
        public string? tipo { get; set; }
        public double salario { get; set; }
        public string? paginaWeb { get; set; }
        public string? ubicacion {get; set;}
        public string? fechaPublicacion { get; set; }
        public string? area { get; set; }
    

    }
}