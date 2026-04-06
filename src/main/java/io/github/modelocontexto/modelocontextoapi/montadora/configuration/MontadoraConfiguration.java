package io.github.modelocontexto.modelocontextoapi.montadora.configuration;

import io.github.modelocontexto.modelocontextoapi.montadora.Motor;
import io.github.modelocontexto.modelocontextoapi.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "motorAspirado")
    // @Primary // -> definindo esse Bean como Primario para o controller
    public Motor motorAspirado() {
        var motor = new Motor();
        motor.setPotencia(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipoMotor(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "motorEletrico")
    public Motor motorEletrico() {
        var motor = new Motor();
        motor.setPotencia(110);
        motor.setCilindros(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipoMotor(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean(name = "motorTurbo")
    public Motor motorTurbo() {
        var motor = new Motor();
        motor.setPotencia(150);
        motor.setCilindros(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(3.5);
        motor.setTipoMotor(TipoMotor.TURBO);
        return motor;
    }
}
