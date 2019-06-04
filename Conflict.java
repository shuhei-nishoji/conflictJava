public class Conflict {
	public static void main(String args[] ) {
		int r;
    for(int j=0;j<10;j++){
		r = new java.util.Random().nextInt(101)+1;
		System.out.println(r);
    }
    for(int i = 30;i > 0;i--){
			System.out.println(i);
		}
	}
}