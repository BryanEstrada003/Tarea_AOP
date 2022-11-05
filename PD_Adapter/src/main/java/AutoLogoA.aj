
public aspect AutoLogoA {

	pointcut success() : call(* imprimir*(..) );
    after() : success() {
    	System.out.println("Ejecutando proceso de conversión...");
    	if(LogotipoAdapter.adaptado) {   
    		System.out.println("Se imprimio");
    	}else {
    		System.out.println("No se realizo la conversión");
    	}
    }
	
}