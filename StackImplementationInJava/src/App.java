
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Stack theStack = new Stack(3);
     theStack.push(15);
     theStack.push(30);
     theStack.push(45);
     theStack.push(46);
     
     
     while(!theStack.isEmpty()) {
    	 System.out.println(theStack.pop());
     }
	}

}
