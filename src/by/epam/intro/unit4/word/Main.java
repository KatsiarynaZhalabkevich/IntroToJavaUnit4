package by.epam.intro.unit4.word;

import by.epam.intro.unit4.word.bean.Sentence;
import by.epam.intro.unit4.word.bean.Text;
import by.epam.intro.unit4.word.bean.Word;

/*
 *Создать объект класса Текст, используя классы Предложение, Слово.
 *Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */
public class Main {

	public static void main(String[] args) {
		Word w1 = new Word("Hello");
		Word w2 = new Word("World");
		Word w3 = new Word("I");
		Word w4 = new Word("learn");

		Sentence sen = new Sentence();

		sen.addToSentence(w1);
		sen.addToSentence(w2);
		sen.addToSentence(w3);
		sen.addToSentence(w4);
		sen.addToSentence(new Word("Java"));

		Text txt = new Text();

		txt.setHead("Java");
		txt.appendText(sen);

		Sentence sen2 = new Sentence();

		sen2.addToSentence(new Word("It"));
		sen2.addToSentence(new Word("is"));
		sen2.addToSentence(new Word("very"));
		sen2.addToSentence(new Word("interesting"));

		txt.appendText(sen2);

		textInfo(txt);
	}

	public static void textInfo(Text text) {

		System.out.println(text.getHead());

		for (Sentence sent : text.getText()) {
			for (Word w : sent.getSentence()) {
				System.out.print(" " + w);
			}
			System.out.print(".");
			System.out.println();
		}

	}

}
