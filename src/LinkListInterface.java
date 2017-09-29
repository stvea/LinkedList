
public interface LinkListInterface<T> {

	//获得线性表长度
	int length();

	//获得指定位置元素
	T get(int position);

	//按值查找位置
	int getPositionByValue(T element);

	//指定位置插入元素
	void insert(T element, int position);

	//删除指定处元素
	T delete(int position);

	//清空
	void clear();

	//判断线性表是否为空  
	boolean isEmpty();

	//打印
	void print();

}