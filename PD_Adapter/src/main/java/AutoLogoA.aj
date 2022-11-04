
public aspect AutoLogoA {

	pointcut success() : call(* imprimir*(..) );
    after() : success() {
    
    	System.out.println("Se imprimio");
    }
	
}