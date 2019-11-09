class ReverStringPattern{
	public static void main(String[] args) {
		char[] c={'d','m','i','n','i'};
		for (int i=0;i<c.length ;i++) {
			for (int j=0;j<=i ;j++ ) {
				System.out.print(c[j]);
			}
			System.out.println();
		}
	}
}