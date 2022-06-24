package ch.ehi.oereb.webservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class WmsKey {

    private String lyrs[];
    public WmsKey(String url) {
        UriComponents builder = UriComponentsBuilder.fromUriString(url).build();
        String paramLayers=OerebController.getWmsParam(builder.getQueryParams(),OerebController.WMS_PARAM_LAYERS);
        List<String> layers=new ArrayList<String>(builder.getQueryParams().get(paramLayers));
        layers.sort(null);
        lyrs=layers.toArray(new String[layers.size()]);
    }
}
