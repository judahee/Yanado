package service.dto;

public class AucJoin {
	String aucNo; // 경매 번호
	String userId; // 유저 아이디
	int bidPrice; // 입찰 금액
	int bidCount; // 다중 입찰
	
	public String getaucNo() {
		return aucNo;
	}
	public String getuserId() {
		return userId;
	}
	public int getbidPrice() {
		return bidPrice;
	}
	public int getbidCount() {
		return bidCount;
	}
	
	public void setaucNo(String aucNo) {
		this.aucNo = aucNo;
	}
	public void setuserId(String userId) {
		this.userId = userId;
	}
	public void setbidPrice(int bidPrice) {
		this.bidPrice = bidPrice;
	}
	public void setbidCount(int bidCount) {
		this.bidCount = bidCount;
	}
}
