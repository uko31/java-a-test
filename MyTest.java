class MyTest {

	public static void main(String[] args) {
		System.out.println("this is a test");
		if ( args.length > 0 ) {
			System.out.println("\targs provided.");
			for (int i=0; i<args.length; i++) {
				System.out.println("\t\t" + args[i])
			}
		}
	}

}
