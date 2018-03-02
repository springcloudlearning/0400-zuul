ZUUL


looks like by default zuul will use random strategy to do load balance ????



need to go thr zuul feature one by one

1. intelligence route
@EnableZuulProxy
zuul:
  routes:
    api-user:
      path: /user/*
      serviceId: service-user
    api-order:
      path: /order/*
      serviceId: service-order

topology

eureka 8761
service-user 8762 8763
service-order 8764 8765
zuul-proxy 8766

And actually, zuul had lb feature, need to check how to configure difference LB option




      
      
