

public class Main {

    public static void main(String[] args) {
    	if(args.length!=2) {
			System.out.println("error in args");
			return;
		}
        //passgen_5_10
		int passl = 0;
		int passc =	0;
		for(int i = 0; i<args.length; ++i){
			String arg = args[i];
		String [] tokens = arg.split("=");
		if(tokens[0].equals("--passl"))
		passl = Integer.parseInt(tokens[1]);
		else if(tokens[0].equals("--passc"))
		passc = Integer.parseInt(tokens[1]);
		}

		System.out.format("passl=%d, passc=%d\n", passl, passc);
		PassGen passgen = new PassGen();
		for(int i = 0; i<passc; ++i)
		{
			String pass = passgen.getPass(passl);
			System.out.println(pass);
		}
    }
}
