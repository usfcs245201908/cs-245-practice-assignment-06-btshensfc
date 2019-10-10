@SuppressWarnings("unchecked")
public class ArrayStack<T> implements Stack<T>{

	T[] arr = (T[]) new Object[10];
	int top = -1;

	public void push(T item){
		if (top == arr.length-1){
			growArray();
		}
		arr[++top] = item; 
	}

	public T pop(){
		if (empty()){
			throw new RuntimeException("Stack is Empty");
		}
		return arr[top--];
	}

	public T peek(){
		if (empty()){
			throw new RuntimeException("Stack is Empty");
		}
		return arr[top];		
	}

	public boolean empty(){
		return(top == -1);
	}

	protected void growArray(){
		T[] temp = (T[]) new Object[arr.length*2];
		for (int i = 0; i < arr.length; i++){
			temp[i] = arr[i];
		}
		arr= temp;
	}



}