/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreemnets.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0 
 * (the "License"); you may not use this file except in compliance with 
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */



package opennlp.tools.lang.english;

import opennlp.tools.sentdetect.AbstractEndOfSentenceScanner;

/**
 * The default end of sentence scanner implements all of the
 * EndOfSentenceScanner methods in terms of the getPositions(char[])
 * method.  It scans for <tt>. ? ! ) and "</tt>.
 *
 * Created: Sat Oct 27 11:46:46 2001
 *
 * @author Eric D. Friedman
 * @version $Id: EndOfSentenceScanner.java,v 1.2 2008-09-28 18:12:21 tsmorton Exp $
 */

public class EndOfSentenceScanner extends AbstractEndOfSentenceScanner {

    public static final char[] eosCharacters =  {'.','?','!'};
    
    /**
     * Creates a new <code>DefaultEndOfSentenceScanner</code> instance.
     *
     */
    public EndOfSentenceScanner() {
        super();
    }
    
    public char[] getEndOfSentenceCharacters() {
      return eosCharacters;
    }
}