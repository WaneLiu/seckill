package org.seckill.entity;

public class Macurl {
	 private int id;
	 private String mac;
	 private String url;
	 private int sum;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	@Override
	public String toString() {
		return "MAC_URL [id=" + id + ", mac=" + mac + ", url=" + url + ", sum=" + sum + "]";
	}
	 
}
