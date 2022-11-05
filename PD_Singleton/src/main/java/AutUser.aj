
import java.util.Scanner;

public aspect AutUser {

	pointcut success() : call(* crearParada*(..) );
    before() : success() {
    
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Ingrese contraseña: ");
        String contraseña_a_verificar=sc.nextLine();
    	
        if (ViajeUber.getViaje().getUsuario().getPassword().equals(contraseña_a_verificar)) {
        	Uber.verficado=true;
        	System.out.println("Verficado");
        } else {
        	Uber.verficado=false;
	        System.out.println("No Verficado, no se puede crear nueva parada");
	    }
    }
	
}
