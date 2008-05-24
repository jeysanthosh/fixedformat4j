/*
 * Copyright 2004 the original author or authors.
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
package com.ancientprogramming.fixedformat4j.format.data;

import com.ancientprogramming.fixedformat4j.annotation.FixedFormatDecimal;

/**
 * Data object containing the exact same data as {@link FixedFormatDecimal}
 *
 * @author Jacob von Eyben www.ancientprogramming.com
 * @since 1.0.0
 */
public class FixedFormatDecimalData {

  private int decimals;
  private boolean useDecimalDelimiter;
  private char decimalDelimiter;

  public FixedFormatDecimalData(int decimals, boolean useDecimalDelimiter, char decimalDelimiter) {
    this.decimals = decimals;
    this.useDecimalDelimiter = useDecimalDelimiter;
    this.decimalDelimiter = decimalDelimiter;
  }

  public int getDecimals() {
    return decimals;
  }

  public boolean isUseDecimalDelimiter() {
    return useDecimalDelimiter;
  }

  public char getDecimalDelimiter() {
    return decimalDelimiter;
  }
}
