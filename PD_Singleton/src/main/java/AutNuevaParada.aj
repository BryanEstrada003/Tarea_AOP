
public aspect AutNuevaParada {

	pointcut success() : call(* crearParada*(..) );
    after() : success() {
    
    	System.out.println("Se crea nueva parada");
    }
	
}
