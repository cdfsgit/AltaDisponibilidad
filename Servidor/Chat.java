public class Chat {
    public static void main(String[] args) {
        int puertoEscucha, puertoAlla;
        String dispositivoAlla;
        puertoEscucha = Integer.parseInt(args[0]);
	Servidor s = new Servidor(puertoEscucha);
	s.iniciarEscucha();
    }
}
