
public aspect AutoLogoA {

	pointcut success() : call(* imprimir*(..) );
    before() : success() {
    	System.out.println("Ejecutando proceso de conversión...");
    	if(LogotipoAdapter.adaptado) {   
    		System.out.println("se puede imprimir");
    	}else {
    		System.out.println("No se puede imprimir");
    	}
    }
	
}