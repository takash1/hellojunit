package junit.example.hellojunit;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingTest {

	@Test
	public void getMessage_朝開始() throws Exception {
		Greeting sut = new Greeting();
		String expected = "おはようございます";
		String actual = sut.getMessage(5);
		assertThat(actual, is(expected));
	}

	@Test
	public void getMessage_昼開始() throws Exception {
		Greeting sut = new Greeting();
		String expected = "こんにちは";
		String actual = sut.getMessage(11);
		assertThat(actual, is(expected));
	}

	@Test
	public void getMessage_夜開始() throws Exception {
		Greeting sut = new Greeting();
		String expected = "こんばんは";
		String actual = sut.getMessage(17);
		assertThat(actual, is(expected));
	}

}
