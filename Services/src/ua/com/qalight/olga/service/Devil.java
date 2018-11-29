package ua.com.qalight.olga.service;

import java.util.logging.Logger;

public class Devil {

	public static Logger logger = Logger.getLogger(Devil.class.getName());

	public static void main(String[] args) {

		printTree(7);
		logger.info(repeatMe(3));
	}

	static String printTree(int ammount) {
		String result = "\n";

		for (int i = 0; i < ammount; i++) {
			result += getSpace(ammount - i) + "/" + getSpace(i * 2) + "\\" + "\n";

		}
		result += getUnderLines(ammount * 2 + 2);
		return result;

	}

	static String getUnderLines(int ammount) {
		String out = "";
		for (int i = 0; i < ammount; i++)
			out += "_";
		return out;
	}

	static String getSpace(int ammount) {
		String result = "";
		for (int i = 0; i < ammount; i++)
			result += " ";
		return result;
	}

	static String repeatMe(int ammount) {
		String result = "";
		for (int i = 0; i < 3; i++)
			result += printTree(ammount);
		return result;

	}

}
