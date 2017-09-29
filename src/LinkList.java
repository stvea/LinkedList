
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
	
	//�����ձ�
	public LinkList() {
		header = null;
		tail = null;
	}
	
	//ָ������Ԫ�ش�����
	public LinkList(T element) {
		header = new Node(element,null);
		tail = header;
		size++;
	}
	
	//������Ա���
	/* (non-Javadoc)
	 * @see LinkListInterface#Length()
	 */
	@Override
	public int length() {
		return size;
	}
	
	//���ָ��λ��Ԫ��
	/* (non-Javadoc)
	 * @see LinkListInterface#get(int)
	 */
	@Override
	public T get(int position) {
		return this.getNodeByPosition(position).data;
	}
	
	//���ָ��λ�õĽڵ�
	public Node getNodeByPosition(int position) {
		if(position<0||position>size-1) 
			throw new IndexOutOfBoundsException("��������");
		
		Node current = header;
		
		for(int i=0;i<size&&current!=null;i++) {
			if(i == position)
				return current;
			current = current.next;
		}
		
		return null;
	}
	
	//��ֵ����λ��
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
	
	//ָ��λ�ò���Ԫ��
	/* (non-Javadoc)
	 * @see LinkListInterface#insert(T, int)
	 */
	@Override
	public void insert(T element, int position) {
		if(position<0||position>size)
			throw new IndexOutOfBoundsException("����Խ��");
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
	
	//��ͷ����Ԫ��
	public void insertFromHead(T element) {
		Node newNode = new Node(element, null);
		newNode.next = header;
		header = newNode;
		
		if(tail==null)
			tail = header;
	}
	
	//��β����Ԫ��
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
	
	//ɾ��ָ����Ԫ��
	/* (non-Javadoc)
	 * @see LinkListInterface#delete(int)
	 */
	@Override
	public T delete(int position) {
		if(position<0 || position> size-1)
			throw new IndexOutOfBoundsException("����Խ��");
		
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
	
	//���
	/* (non-Javadoc)
	 * @see LinkListInterface#clear()
	 */
	@Override
	public void clear() {
		header = tail = null;
		size = 0;
	}
	 //�ж����Ա��Ƿ�Ϊ��  
    /* (non-Javadoc)
	 * @see LinkListInterface#isEmpty()
	 */
    @Override
	public boolean isEmpty(){  
        return size == 0;  
    }  
	//��ӡ
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