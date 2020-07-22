package vn.t3h.ls7;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWrite {
	public static void main(String[] args) {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("Hoten", "Tran Van Huy Bu");
		jsonObj.put("Ngaysinh", "6/5/2000");
		jsonObj.put("Gioitinh", "Wibu");
		String jsonToString = jsonObj.toJSONString();
		System.out.println(jsonToString);
		WriteFile.toFile("tennv.json",jsonToString);
		JSONArray jArray = new JSONArray();
		jArray.add(jsonObj);
	}
}
