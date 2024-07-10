package com.consul.example.demo_app_consul_connect.service;

import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.Response;
import com.ecwid.consul.v1.kv.model.GetValue;
import org.springframework.stereotype.Service;


@Service
public class ConsulService {

    private final ConsulClient consulClient;

    public ConsulService(ConsulClient consulClient) {
        this.consulClient = consulClient;
    }

    public String getValue(String key) {
        Response<GetValue> response = consulClient.getKVValue(key);
        GetValue value = response.getValue();
        return value != null ? value.getDecodedValue() : null;
    }

    @SuppressWarnings("rawtypes")
    public Response putValue(String key, Integer value) {
        Response<Boolean> res = consulClient.setKVValue(key, Integer.toString(value));
        return res;
    }
}
