package com.joot.lib;

import java.util.*;

public class StrUtil
{
  public StrUtil() { }

  public String lowerCase( String s )
  {
    return s.toLowerCase();
  }

  public String leftStr( String param, Double to )
  {
    return param.substring( 0, to.intValue() );
  }

  public String rightStr( String param, Double from )
  {
    return param.substring( from.intValue(), param.length() );
  }

  public double indexOf( String param, String toFind )
  {
    return param.indexOf( toFind );
  }
}
