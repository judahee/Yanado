package service.dto;

import java.util.Date;

public class Auc {
	String aucNo; // 경매 번호
	Product product; // 물건
	Product producterId; // 물건 id
	Date regDate; // 경매 등록 날짜
	Date startDate; // 경매 시작 날짜
	Date endDate; // 경매 마감 날짜
	String status; // 경매 상태
	int highestPrice; // 고가
	int lowestPrice; // 저가
	String highestUserId; // 고가 구매자 아이디
	int participants; // 참여자 수
	String payment; // 지불 방법
	
	public String getaucNo() {
		return aucNo;
	}
	public Product getproduct() {
		return product;
	}
	public Product getproductId() {
		return producterId;
	}
	public Date getregDate() {
		return regDate;
	}
	public Date getstartDate() {
		return startDate;
	}
	public Date getendDate() {
		return endDate;
	}
	public String getstatus() {
		return status;
	}
	public int gethighestPrice() {
		return highestPrice;
	}
	public int getlowestPrice() {
		return lowestPrice;
	}
	public String gethighestUserId() {
		return highestUserId;
	}
	public int getparticipants() {
		return participants;
	}
	public String getpayment() {
		return payment;
	}
	
	public void setaucNo(String aucNo) {
		this.aucNo = aucNo;
	}
	public void setproduct(Product product) {
		this.product = product;
	}
	public void setproductId(Product producerId) {
		this.producterId = producerId;
	}
	public void setregDate(Date regDate) {
		this.regDate = regDate;
	}
	public void setstartDate(Date startDate) {
		this.startDate = startDate;
	}
	public void setendDate(Date endDate) {
		this.endDate = endDate;
	}
	public void setstatus(String status) {
		this.status = status;
	}
	public void sethighestPrice(int highestPrice) {
		this.highestPrice = highestPrice;
	}
	public void setlowestPrice(int lowestPrice) {
		this.lowestPrice = lowestPrice;
	}
	public void sethighestUserId(String highestUserId) {
		this.highestUserId = highestUserId;
	}
	public void setparticipants(int participants) {
		this.participants = participants;
	}
	public void setpayment(String payment) {
		this.payment = payment;
	}
}
