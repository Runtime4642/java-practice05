package prob5;



public class MyStack {
	private int top;
	private String[] buffer;

	@SuppressWarnings("unchecked")
	public MyStack(int capacity) {
		buffer = new String[capacity];
		top = -1;
	}

	public void push(String s) {
		if(top+1 >= buffer.length)
		{
			String [] buffer2 = new String[buffer.length];
			buffer2 = buffer;
			buffer = new String[buffer2.length*2];
			for(int i=0;i<buffer2.length;i++)
				buffer[i]=buffer2[i];
		}
		buffer[++top]=s;
	}
	public String pop() throws MyStackException {
		boolean isDanger = false;
		if(buffer[0]==null)
			isDanger=true;
		if(isDanger) {
		//예외 상황발생
		throw new MyStackException();
		}		
	
		String s=null;

		 s = buffer[top];
		buffer[top--] = null;
		return s;

	}

	public boolean isEmpty() {
		return top == -1;
	}
}