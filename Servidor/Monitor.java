import java.io.*;
public class Monitor {
	
	public void uptime(){
		System.out.println(resultadoComando("uptime"));
	}
	
	public void free(){
		System.out.println(resultadoComando("free"));
	}
	
	
	private String resultadoComando(String comando){
		String ret = "";
		try {
			Runtime r = Runtime.getRuntime();
			Process p = r.exec(comando);
			p.waitFor();
			BufferedReader b = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line = "";
			while ((line = b.readLine()) != null) {
				ret = ret + line + "\n";
			}
			b.close();
		} 
		catch(IOException e1) {}
		catch(InterruptedException e2) {}
		return ret;
	}
}



