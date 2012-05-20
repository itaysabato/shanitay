package com.shanitay.client.robot;

import com.shanitay.client.utils.Utils;
import org.vectomatic.dom.svg.OMSVGGElement;
import org.vectomatic.dom.svg.OMSVGPathElement;
import org.vectomatic.dom.svg.OMSVGSVGElement;

/**
 * Created By: Itay Sabato<br/>
 * Date: 17/05/12 <br/>
 * Time: 20:04 <br/>
 */
class ElementLoader {

    final OMSVGGElement tooth1;
    final OMSVGGElement tooth2;
    final OMSVGGElement tooth3;
    final OMSVGGElement tooth4;
    final OMSVGGElement tooth5;
    final OMSVGGElement tooth6;
    final OMSVGGElement electricWhite;
    final OMSVGGElement electricBlack;
    final OMSVGGElement lightningButton;
    final OMSVGPathElement earRight;
    final OMSVGPathElement earLeft;

    public ElementLoader(OMSVGSVGElement svgsvgElement) {
        tooth1 = Utils.getGElement("tooth1", svgsvgElement);
        tooth2 = Utils.getGElement("tooth2", svgsvgElement);
        tooth3 = Utils.getGElement("tooth3", svgsvgElement);
        tooth4 = Utils.getGElement("tooth4", svgsvgElement);
        tooth5 = Utils.getGElement("tooth5", svgsvgElement);
        tooth6 = Utils.getGElement("tooth6", svgsvgElement);

        lightningButton = Utils.getGElement("lightningButton", svgsvgElement);
        electricWhite =Utils.getGElement("electricWhite", svgsvgElement);
        electricBlack = Utils.getGElement("electricBlack", svgsvgElement);

        earRight = (OMSVGPathElement) Utils.getSVGElement("earRight", svgsvgElement);
        earLeft = (OMSVGPathElement) Utils.getSVGElement("earLeft", svgsvgElement);
    }
}
