package controlador;


import java.util.*;
import modelo.*;
import modelo.Abono.Tipo;

public class AbonoController 
{
	private Vector<AbonoVO> abonos;
	
	public AbonoController()
	{
		
	}
	
	public Vector<AbonoVO> GetAbonos() {
		abonos = new Vector<AbonoVO>();
		Abono a = new Abono();
		Vector<Abono> res = a.GetAbonos();
		
		for(Abono r : res) {
			AbonoVO v = new AbonoVO();
			v.setCodAbono(r.getCodAbono());
			v.setNombre(r.getNombre());
			v.setPrecio(r.getPrecio());
			v.setVigencia(r.getVigencia());
			v.setTipo(r.getTipo());
			
			abonos.add(v);
		}
		
		return abonos;
	}
	
	public void AgregarAbono(int codAbono, String nombre, Float precio, Date vigencia, Tipo tipo)
	{
		Abono a = new Abono(codAbono, nombre, precio, vigencia, tipo);
		a.AgregarAbono();		
	}
	
	public void ModificarAbono(int codAbono, String nombre, Float precio, Date vigencia, Tipo tipo)
	{

	}
}

