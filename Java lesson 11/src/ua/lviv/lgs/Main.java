package ua.lviv.lgs;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	static void menu() {
		System.out.println();
		System.out.println("¬вед≥ть 1, щоб вивести toString() даних елемент≥в масиву на консоль");
		System.out.println("¬вед≥ть 2, щоб дл€ вс≥х об`Їкт≥в даного масиву засетити одинаковий  об`Їкт класу јвто");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		material Material[] = material.values();

		while (true) {
			menu();

			switch (scanner.nextInt()) {

			case 1: {

				Auto auto[][] = new Auto[getRandomValueFromRange(1, 5)][getRandomValueFromRange(1, 5)];

				for (int i = 0; i < auto.length; i++) {
					for (int j = 0; j < auto[i].length; j++) {
						auto[i][j] = new Auto(getRandomValueFromRange(100, 250),
								getRandomValueFromRange(1980, 2018),
								new Helm(getRandomValueFromRange(35, 50),
										Material[getRandomValueFromRange(0, Material.length - 1)].toString()),
								new Engine(getRandomValueFromRange(2, 12)));
					}
				}

				System.out.println(Arrays.deepToString(auto));
				
				break;
			}

			case 2: {

				Auto auto = new Auto(getRandomValueFromRange(100, 250), getRandomValueFromRange(1980, 2018),
						new Helm(getRandomValueFromRange(35, 50),
								Material[getRandomValueFromRange(0, Material.length - 1)].toString()),
						new Engine(getRandomValueFromRange(2, 12)));

				Auto autoArray[] = new Auto[getRandomValueFromRange(1, 5)];

				Arrays.fill(autoArray, auto);

				System.out.println(Arrays.deepToString(autoArray));
				
				break;
			}

			default: {
				System.out.println("Only 1 or 2");

				break;
			}

			}
		}
	}

	static int getRandomValueFromRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("Min value must be less than max value!");
		}

		Random randomValue = new Random();
		return randomValue.nextInt(max - min + 1) + min;
	}
}
