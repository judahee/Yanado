package persistence.dao;

import java.util.List;

public class AucDAO {
	boolean isParticipate(String userId) {
		return false;
	}
	List<Auc> getAllAucList() {
		return null;
	}
	Auc getAuc(int aucNo) {
		return null;
	}
	void regAuction(Auc auc) {
	}
	List<Auc> findAucById(String aucId) {
		return null;
	}
	List<Auc> findAucByProduct(String productId) {
		return null;
	}
	List<Auc> getMyAuc(String userNo) {
		return null;
	}
	List<User> getBuyerListByAucNo(int aucNo) {
		return null;
	}
	void sendAlarm(Alarm alarm) {
	}
	void changeStatus(String aucNo) {
	}
	Product findProductByAuc(String aucId) {
		return null;
	}
}
