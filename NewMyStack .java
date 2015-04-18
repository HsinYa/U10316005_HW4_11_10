public class NewMyStack extends java.util.ArrayList<Object>{
	
	//Return true or false
	public boolean isEmpty(){
		return super.isEmpty();
	}
	//Return superclass's method of size()
	public int getSize(){
		return size();
	}
	//Return superclass's method of get()
	public Object peek(){
		return get(getSize()-1);
	}
	//Remove superclass's the last value and return superclass's method of get()
	public Object pop(){
		Object o = get(getSize()-1);
		remove(getSize()-1);
		return o ;
	}
	//Find superclass's method of add() and add the value 
	public void push(Object o){
		add(o);
	}
	
	@Override
	//Find superclass's method of toString()
	public String toString(){
		return "stack" + toString();
	}
}
