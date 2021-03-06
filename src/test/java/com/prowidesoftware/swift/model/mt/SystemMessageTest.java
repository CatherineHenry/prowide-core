/*
 * Copyright 2006-2018 Prowide
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.prowidesoftware.swift.model.mt;

import org.junit.Ignore;

@Ignore
public class SystemMessageTest {

	/* sebastian marxo 2016 los getters con Fieldnn se sacaron por dependencia circular en codegen
	@Test
	public void testParseAck() {
		SystemMessage sysMessage = SystemMessage.parse("{1:F21MLCOUS33AXXX0221000001}{4:{177:1702040914}{451:0}}");
		assertNotNull(sysMessage);
		assertTrue(sysMessage.isAck());
		assertEquals("1702040914", sysMessage.getField177().getValue());
		assertEquals("0", sysMessage.getField451().getValue());
	}

	@Test
	public void testParseNak() {
		SystemMessage sysMessage = SystemMessage.parse("{1:F21MLCOUS33AXXX0221000001}{4:{177:1702040914}{451:1}}");
		assertNotNull(sysMessage);
		assertTrue(sysMessage.isNack());
		assertEquals("1702040914", sysMessage.getField177().getValue());
		assertEquals("1", sysMessage.getField451().getValue());
	}
	*/
}
