using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;
using EmpleosDoApi.Model;

namespace EmpleosDoApi.DATA
{
    public class Context : DbContext
    {
        
        public Context(DbContextOptions<Context> options) : base(options){}
       

        public DbSet<Empleos> Empleos { get; set; }
        
    }
}