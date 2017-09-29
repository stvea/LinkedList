
public class Main {
	public static void main(String[] args) {
		LinkList<String> list = new LinkList("好");  
        list.print();
        
        // 测试添加元素  
        list.add("ni");  
        list.add("没");  
        list.print(); 
  
        // 在头部添加  
        list.insertFromHead("五月");  
        list.print();
  
        // 在指定位置添加  
        list.insert("摩卡", 2);  
        list.print();
  
        // 获取指定位置处的元素  
        System.out.println("第2个元素是（从0开始计数）：" + list.get(2));  
  
        // 返回元素索引  
        System.out.println("摩卡在的位置是：" + list.getPositionByValue("摩卡"));  
        System.out.println("moka所在的位置：" + list.getPositionByValue("moka"));  
  
        // 获取长度  
        System.out.println("当前线性表的长度：" + list.length());  
  
        // 判断是否为空  
        System.out.println(list.isEmpty());  
   
  
        // 删除指定位置处元素  
        list.delete(3);  
        System.out.println("删除第4个元素后：" + list);  
  
        // 获取长度  
        System.out.println("当前线性表的长度：" + list.length());  
  
        // 清空  
        list.clear();  
        list.print();  
  
        // 判断是否为空  
        System.out.println(list.isEmpty());  
	}
}
