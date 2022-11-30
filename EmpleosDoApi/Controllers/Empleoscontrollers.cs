using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;
using EmpleosDoApi.DATA;
using EmpleosDoApi.Model;
using Microsoft.AspNetCore.Mvc;
namespace EmpleosDoApi.Controllers;
   
    [Route("api/[controller]")]
    [ApiController]
    public class Empleoscontrollers : ControllerBase
    {
        private readonly Context _context;

        public Empleoscontrollers(Context context)
        {
            _context = context;
        }
 
       
        [HttpGet]
        [Route("")]
        public async Task<ActionResult<IEnumerable<Empleos>>> GetEmpleo()
        {
            return await _context.Empleos.ToListAsync();
        }

       
        [HttpGet("{id}")]
        public async Task<ActionResult<Empleos>> GetEmpleo(int id)
        {
            var empleos = await _context.Empleos.FindAsync(id);

            if (empleos == null)
            {
                return NotFound();
            }

            return empleos;
        }

        
        [HttpPut("{id}")]
        public async Task<IActionResult> PutEmpleo(int id, Empleos empleos)
        {
            if (id != empleos.id)
            {
                return BadRequest();
            }

            _context.Entry(empleos).State = EntityState.Modified;

            try
            {
                await _context.SaveChangesAsync();
            }
            catch (DbUpdateConcurrencyException)
            {
                if (!EmpleosExists(id))
                {
                    return NotFound();
                }
                else
                {
                    throw;
                }
            }

            return NoContent();
        }


        [HttpPost]
        [Route("")]
        public async Task<ActionResult<Empleos>> PostEmpleos(Empleos empleos)
        {
            _context.Empleos.Add(empleos);
            await _context.SaveChangesAsync();

            return CreatedAtAction("GetEmpleos", new { id = empleos.id}, empleos);
        }

        // DELETE: api/Articulos/5
        [HttpDelete("{id}")]
        public async Task<IActionResult> DeleteEmpleos(int id)
        {
            var empleos = await _context.Empleos.FindAsync(id);
            if (empleos == null)
            {
                return NotFound();
            }

            _context.Empleos.Remove(empleos);
            await _context.SaveChangesAsync();

            return NoContent();
        }

        private bool EmpleosExists(int id)
        {
            return _context.Empleos.Any(e => e.id == id);
        }
        
    }
