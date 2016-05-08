package com.wz.file.utils;

import java.util.Comparator;

import com.wz.file.bean.SortModel;

public class PinyinComparator implements Comparator<SortModel> {

	@Override
	public int compare(SortModel o1, SortModel o2) {
		if (o1.getSortLetters().equals("@") || o2.getSortLetters().equals("#")) {
			return -1;
		} else if (o1.getSortLetters().equals("#") || o2.getSortLetters().equals("@")) {
			return 1;
		} else {
			return o1.getSortLetters().compareTo(o2.getSortLetters());
		}
	}

}
