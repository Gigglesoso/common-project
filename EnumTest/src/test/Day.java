package test;

enum Day {
	
    MONDAY("����һ"),
    TUESDAY("���ڶ�"),
    WEDNESDAY("������"),
    THURSDAY("������"),
    FRIDAY("������"),
    SATURDAY("������"),
    SUNDAY("������");
	
	//˽�����ԣ����Դ洢����ö�����������˵��
	private String desc;
	 
    /**
     * ˽�й���,��ֹ���ⲿ����
     * @param desc
     */
    private Day(String desc){
        this.desc=desc;
    }
    
    //get����,������ȡ����
	public String getDesc() {
		return desc;
	}

}
