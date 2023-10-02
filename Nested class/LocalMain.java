class LocalOuter{
	int a =900;	
	void show(){
		class LocalInner{
			void present(){
				System.out.println(a);
			}
		}
		LocalInner LI = new LocalInner();
		LI.present();
	}
}
class LocalMain{
	public static void main(String args[]){
		LocalOuter LO = new LocalOuter();
		LO.show();
	}
}