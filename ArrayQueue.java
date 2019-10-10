@SuppressWarnings("unchecked")
public class ArrayQueue<T> implements Queue<T>{

	T[] arr = (T[]) new Object[10];
	int head=0;

	public T dequeue(){
		if(empty()){ 
			throw new RuntimeException("Queue is Empty");
		}
		for(int i=1;i<=head;i++){
			arr[i-1]=arr[i];
		}

		head--;
		return arr[0];
	}

	public void enqueue(T item){
		if(head>=arr.length-1){
			growArray();
		}
		arr[++head]=item;
	}	

	public boolean empty(){
		return (head==0);
	}

	protected void growArray(){
		T[] temp = (T[]) new Object[arr.length*2];
		for (int i = 0; i < arr.length; i++){
			temp[i] = arr[i];
		}
		arr = temp;
	}

}
