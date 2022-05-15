package one.digitalInnovation.gof;


import one.digitalInnovation.gof.Facade.Facade;
import one.digitalInnovation.gof.Singleton.SingletonEager;
import one.digitalInnovation.gof.Singleton.SingletonLazy;
import one.digitalInnovation.gof.Singleton.SingletonLazyHolder;
import one.digitalInnovation.gof.Strategy.ComportamentoDefensivo;
import one.digitalInnovation.gof.Strategy.ComportamentoNormal;
import one.digitalInnovation.gof.Strategy.ComportamentoAgressivo;
import one.digitalInnovation.gof.Strategy.Robo;
import one.digitalInnovation.gof.Strategy.Comportamento;



public class Test {
    public static <Comportamento> void main(String[] args) {

        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy

        Comportamento defensivo = (Comportamento) new ComportamentoDefensivo();
        Comportamento normal = (Comportamento) new ComportamentoNormal();
        Comportamento agressivo = (Comportamento) new ComportamentoAgressivo();

        Robo robo;
        robo = new Robo();
        robo.setComportamento((one.digitalInnovation.gof.Strategy.Comportamento) normal);
        robo.mover();
        robo.mover();
        robo.setComportamento((one.digitalInnovation.gof.Strategy.Comportamento) defensivo);
        robo.mover();
        robo.setComportamento((one.digitalInnovation.gof.Strategy.Comportamento) agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facade

        Facade facade = new Facade();
        facade.migrarCliente("Erika", "60025101");
    }
}
