package org.jhe.spikes.override.sample;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ConcreteSampleTest extends AbstractSample {
	private AbstractSample sample;
	private ConcreteSample sample2;
	@Before
	public void setUp() {
		sample = new ConcreteSample();
		sample2 = new ConcreteSample();
	}
	@Test
	public void testPublicConcrete() {
		assertEquals("do complex stuff",sample.complex());
	}
	@Test
	public void testPrivateConcrete() {
		assertEquals("do basic private stuff",sample.complexUsingPrivate());
	}
	@Test
	public void testStaticConcrete() {
		assertEquals("do basic static stuff",sample.complexUsingStatic());
	}
	@Test
	public void testStaticConcreteWellDeclared() {
		assertEquals("do basic static stuff",sample2.complexUsingStatic());
	}

}
