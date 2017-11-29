package com.inatel.dm110.calculadora.impl;

import com.inatel.dm110.calculadora.api.CalculadoraService;
import com.inatel.dm110.calculadora.api.Result;

public class CalculadoraServiceImpl implements CalculadoraService {

	@Override
	public Result sum(Double first, Double second) {
		return new Result(first, second, first+second);
	}

	@Override
	public Result sub(Double first, Double second) {
		return new Result(first, second, first-second);
	}

}
