package test;

enum Day {
	
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");
	
	//私有属性，可以存储除了枚举意外的中文说明
	private String desc;
	 
    /**
     * 私有构造,防止被外部调用
     * @param desc
     */
    private Day(String desc){
        this.desc=desc;
    }
    
    //get方法,用来获取描述
	public String getDesc() {
		return desc;
	}

}
