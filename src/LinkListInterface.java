
public interface LinkListInterface<T> {

	//������Ա���
	int length();

	//���ָ��λ��Ԫ��
	T get(int position);

	//��ֵ����λ��
	int getPositionByValue(T element);

	//ָ��λ�ò���Ԫ��
	void insert(T element, int position);

	//ɾ��ָ����Ԫ��
	T delete(int position);

	//���
	void clear();

	//�ж����Ա��Ƿ�Ϊ��  
	boolean isEmpty();

	//��ӡ
	void print();

}