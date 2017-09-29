
public class LinkList<T> implements LinkListInterface<T> {
	private class Node{
		private T data;
		private Node next;
		
		public Node() {	
		}
		
		public Node(T data,Node next) {
			this.data = data;
			this.next = next;
		}
	}
	
	private Node header;
	private Node tail;
	private int size;
	
	//创建空表
	public LinkList() {
		header = null;
		tail = null;
	}
	
	//指定数据元素创建表
	public LinkList(T element) {
		header = new Node(element,null);
		tail = header;
		size++;
	}
	
	//获得线性表长度
	/* (non-Javadoc)
	 * @see LinkListInterface#Length()
	 */
	@Override
	public int length() {
		return size;
	}
	
	//获得指定位置元素
	/* (non-Javadoc)
	 * @see LinkListInterface#get(int)
	 */
	@Override
	public T get(int position) {
		return this.getNodeByPosition(position).data;
	}
	
	//获得指定位置的节点
	public Node getNodeByPosition(int position) {
		if(position<0||position>size-1) 
			throw new IndexOutOfBoundsException("超出索引");
		
		Node current = header;
		
		for(int i=0;i<size&&current!=null;i++) {
			if(i == position)
				return current;
			current = current.next;
		}
		
		return null;
	}
	
	//按值查找位置
	/* (non-Javadoc)
	 * @see LinkListInterface#getPositionByValue(T)
	 */
	@Override
	public int getPositionByValue(T element) {
		Node current = header;
		
		for(int i=0;i<size && current!=null;i++) {
			if(current.data.equals(element))
				return i;
			current = current.next;
		}
		
		return -1;
	}
	
	//指定位置插入元素
	/* (non-Javadoc)
	 * @see LinkListInterface#insert(T, int)
	 */
	@Override
	public void insert(T element, int position) {
		if(position<0||position>size)
			throw new IndexOutOfBoundsException("索引越界");
		if(position == 0)
			insertFromHead(element);
		else if(position == size-1||header == null)
			add(element);
		else {
			Node prev = getNodeByPosition(position-1);
			prev.next = new Node(element, prev.next);
			size++;
		}
		
	}
	
	//从头插入元素
	public void insertFromHead(T element) {
		Node newNode = new Node(element, null);
		newNode.next = header;
		header = newNode;
		
		if(tail==null)
			tail = header;
	}
	
	//从尾插入元素
	public void add(T element) {
		if(header == null) {
			header = new Node(element,null);
			tail = header;
		}else {
			Node newNode = new Node(element,null);
			tail.next = newNode;
			tail = newNode;
		}
		
	}
	
	//删除指定处元素
	/* (non-Javadoc)
	 * @see LinkListInterface#delete(int)
	 */
	@Override
	public T delete(int position) {
		if(position<0 || position> size-1)
			throw new IndexOutOfBoundsException("索引越界");
		
		Node del = null;
		
		if(position == 0) {
			del = header;
			header = header.next;
		}else{
			Node prev = getNodeByPosition(position-1);
			del = prev.next;
			prev.next = del.next;
			del.next = null;
		}
		size--;
		return del.data;
	}
	
	//清空
	/* (non-Javadoc)
	 * @see LinkListInterface#clear()
	 */
	@Override
	public void clear() {
		header = tail = null;
		size = 0;
	}
	 //判断线性表是否为空  
    /* (non-Javadoc)
	 * @see LinkListInterface#isEmpty()
	 */
    @Override
	public boolean isEmpty(){  
        return size == 0;  
    }  
	//打印
	/* (non-Javadoc)
	 * @see LinkListInterface#print()
	 */
	@Override
	public void print() {
		if(isEmpty())
			System.out.print("null");
		else {
			Node current = header;
			for(int i = 0;i<size&&current != null;i++) {
				System.out.print(current.data+",");
			}
		}
	}
}