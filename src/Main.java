
public class Main {
	public static void main(String[] args) {
		LinkList<String> list = new LinkList("��");  
        list.print();
        
        // �������Ԫ��  
        list.add("ni");  
        list.add("û");  
        list.print(); 
  
        // ��ͷ�����  
        list.insertFromHead("����");  
        list.print();
  
        // ��ָ��λ�����  
        list.insert("Ħ��", 2);  
        list.print();
  
        // ��ȡָ��λ�ô���Ԫ��  
        System.out.println("��2��Ԫ���ǣ���0��ʼ��������" + list.get(2));  
  
        // ����Ԫ������  
        System.out.println("Ħ���ڵ�λ���ǣ�" + list.getPositionByValue("Ħ��"));  
        System.out.println("moka���ڵ�λ�ã�" + list.getPositionByValue("moka"));  
  
        // ��ȡ����  
        System.out.println("��ǰ���Ա�ĳ��ȣ�" + list.length());  
  
        // �ж��Ƿ�Ϊ��  
        System.out.println(list.isEmpty());  
   
  
        // ɾ��ָ��λ�ô�Ԫ��  
        list.delete(3);  
        System.out.println("ɾ����4��Ԫ�غ�" + list);  
  
        // ��ȡ����  
        System.out.println("��ǰ���Ա�ĳ��ȣ�" + list.length());  
  
        // ���  
        list.clear();  
        list.print();  
  
        // �ж��Ƿ�Ϊ��  
        System.out.println(list.isEmpty());  
	}
}
