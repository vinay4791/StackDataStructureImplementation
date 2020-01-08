
public class Stack {

	private int maxSize;
	private long[] stackArray;
	private int top;

	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new long[size];
		this.top = -1;
	}

	public void push(long element) {
		if (!isFull()) {
			top++;
			stackArray[top] = element;
		} else {
			System.out.println(" The Stack is Full ");
		}
	}

	public long pop() {
		if (!isEmpty()) {
			int previous_top = top;
			top--;
			return stackArray[previous_top];
		}else {
			System.out.println(" The Stack is Empty ");
			return -1;
		}
	}

	// function will written the element which is placed on the top right now!!!
	public long peek() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (maxSize - 1 == top);
	}
}
