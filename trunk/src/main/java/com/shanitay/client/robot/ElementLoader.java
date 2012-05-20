package com.shanitay.client.robot;

import com.shanitay.client.utils.Utils;
import org.vectomatic.dom.svg.*;

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
    final OMSVGGElement earHandle;
    final OMSVGGElement coopButton;
    final OMSVGGElement bgCoop1;
    final OMSVGGElement bgCoop2;
    final OMSVGGElement bgCoop3;
    final OMSVGRectElement coopButtonCenter;
    final OMSVGElement pumpLight;
    final OMSVGGElement smallLightning;
    final OMSVGGElement eyeBallLeft;
    final OMSVGGElement eyeBallRight;
    final OMSVGGElement step1;
    final OMSVGGElement step2;
    final OMSVGGElement step3;
    final OMSVGGElement step4;
    final OMSVGGElement step5;
    final OMSVGGElement step6;
    final OMSVGGElement step7;

    public ElementLoader(OMSVGSVGElement svgsvgElement) {
        tooth1 = Utils.getGElement("tooth1", svgsvgElement);
        tooth2 = Utils.getGElement("tooth2", svgsvgElement);
        tooth3 = Utils.getGElement("tooth3", svgsvgElement);
        tooth4 = Utils.getGElement("tooth4", svgsvgElement);
        tooth5 = Utils.getGElement("tooth5", svgsvgElement);
        tooth6 = Utils.getGElement("tooth6", svgsvgElement);

        lightningButton = Utils.getGElement("lightningButton", svgsvgElement);
        electricWhite = Utils.getGElement("electricWhite", svgsvgElement);
        electricBlack = Utils.getGElement("electricBlack", svgsvgElement);

        earRight = (OMSVGPathElement) Utils.getSVGElement("earRight", svgsvgElement);
        earLeft = (OMSVGPathElement) Utils.getSVGElement("earLeft", svgsvgElement);
        earHandle = Utils.getGElement("earHandle", svgsvgElement);

        coopButton = Utils.getGElement("coopButton", svgsvgElement);
        bgCoop1 = Utils.getGElement("bgCoop1", svgsvgElement);
        bgCoop2 = Utils.getGElement("bgCoop2", svgsvgElement);
        bgCoop3 = Utils.getGElement("bgCoop3", svgsvgElement);
        coopButtonCenter = (OMSVGRectElement) Utils.getSVGElement("coopButtonCenter", svgsvgElement);

        pumpLight = Utils.getSVGElement("pumpLight", svgsvgElement);
        smallLightning = Utils.getGElement("smallLightning", svgsvgElement);

        eyeBallLeft = Utils.getGElement("eyeBallLeft", svgsvgElement);
        eyeBallRight = Utils.getGElement("eyeBallRight", svgsvgElement);

        step1 = Utils.getGElement("step1", svgsvgElement);
        step2 = Utils.getGElement("step2", svgsvgElement);
        step3 = Utils.getGElement("step3", svgsvgElement);
        step4 = Utils.getGElement("step4", svgsvgElement);
        step5 = Utils.getGElement("step5", svgsvgElement);
        step6 = Utils.getGElement("step6", svgsvgElement);
        step7 = Utils.getGElement("step7", svgsvgElement);
    }
}
