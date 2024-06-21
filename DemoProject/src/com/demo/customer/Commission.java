package com.demo.customer;

public class Commission {

	private String Name,Address;
	private  int Phone;
	private double Sales_Amount;
	private double Commission_Amt = 0;
	
	public Commission(String Name,String Address,int Phone,double Sales_Amt)
	{
		this.Name = Name;
		this.Phone = Phone;
		this.Sales_Amount = Sales_Amt;
		this.Address = Address;
		
	}
	
	
	
	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public String getAddress() {
		return Address;
	}



	public void setAddress(String address) {
		Address = address;
	}



	public int getPhone() {
		return Phone;
	}



	public void setPhone(int phone) {
		Phone = phone;
	}



	public double getSales_Amount() {
		return Sales_Amount;
	}



	public void setSales_Amount(double sales_Amount) {
		
		
		
		Sales_Amount = sales_Amount;
	}

	public double Commission_Calc()
	{
		if(this.Sales_Amount >=100000)
		{
			this.Commission_Amt = (this.Sales_Amount * 10)/100;
		}
		else if(this.Sales_Amount>50000 && this.Sales_Amount<=100000)
		{
			this.Commission_Amt = (this.Sales_Amount * 5)/100;
		}
		else if(this.Sales_Amount>30000 && this.Sales_Amount<=50000)
		{
			this.Commission_Amt = (this.Sales_Amount * 3)/100;
		}
		else if(this.Sales_Amount<30000) {
				this.Commission_Amt = 0;
		}
		
		return Commission_Amt;
		
	}


	@Override
	public String toString() {
		return "Commission [Name=" + Name + ", Address=" + Address + ", Phone=" + Phone + ", Sales_Amount="
				+ Sales_Amount + "]";
	}



	public static void main(String args[]) {
		
		Commission c1 = new Commission("Abdulkader" ,"121 River Street ",1244444,100000);
		System.out.println(c1);
		System.out.println(c1.Commission_Calc());
	
	}
	
	
}
