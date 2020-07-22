package bai1;

public class Customer {
	private String callId;
	private String name;
	private String callTime;
	private String musicName;
	public Customer(String callId, String name, String callTime, String musicName) {
		this.callId = callId;
		this.name = name;
		this.callTime = callTime;
		this.musicName = musicName;
	}
	public String getCallId() {
		return callId;
	}
	public void setCallId(String callId) {
		this.callId = callId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCallTime() {
		return callTime;
	}
	public void setCallTime(String callTime) {
		this.callTime = callTime;
	}
	public String getMusicName() {
		return musicName;
	}
	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}
	public String toString()
	{
		return "callId=" + callId + ", name =" + name +", callTime=" + callTime + ", musicName = " + musicName;
	}
	
}
