
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href=""""),_display_(Seq[Any](/*4.31*/routes/*4.37*/.Assets.at("bootstrap-3.1.1-dist/css/bootstrap.min.css"))),format.raw/*4.93*/("""">
<link rel="stylesheet" href=""""),_display_(Seq[Any](/*5.31*/routes/*5.37*/.Assets.at("css/style.css"))),format.raw/*5.64*/("""">
<!--original scripts-->
</head>
<body>

<div class="container">
<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">TimeLine</a>
        </div>
        
      </div>
    


<div id="content">
	<h3>Today's timeline</h3>
	<div class="row">
		<div class="col-sm-4">
			<pre>
<i class="icon-time"></i>勤務時間
<form class="form-inline">
<input type="time" id="start">～<input type="time" id="end">
<button class="btn btn-success btn-small"><i class="icon-refresh"></i>更新</button>
</form>
			</pre>


			<table class="table" id="timelinetable">
				<thead>
					<tr>
						<th>time</th>
						<th>event</th>
					</tr>
				</thead>
				<tbody>
				</tbody>
			</table>
		</div>
		<div class="col-sm-8 sidemenu"></div>
	</div>
</div><!--container-->
</div><!--/timeline-->
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*55.42*/routes/*55.48*/.Assets.at("bower_components/jquery/jquery.js"))),format.raw/*55.95*/(""""></script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*56.42*/routes/*56.48*/.Assets.at("bower_components/underscore/underscore.js"))),format.raw/*56.103*/(""""></script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*57.42*/routes/*57.48*/.Assets.at("bower_components/backbone/backbone.js"))),format.raw/*57.99*/(""""></script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*58.42*/routes/*58.48*/.Assets.at("d3.min.js"))),format.raw/*58.71*/(""""></script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*59.42*/routes/*59.48*/.Assets.at("json2.js"))),format.raw/*59.70*/(""""></script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*60.42*/routes/*60.48*/.Assets.at("bootstrap-3.1.1-dist/js/bootstrap.min.js"))),format.raw/*60.102*/(""""></script>
<!--Original js files-->
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*62.42*/routes/*62.48*/.Assets.at("javascript/index.js"))),format.raw/*62.81*/(""""></script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*63.42*/routes/*63.48*/.Assets.at("javascript/model.js"))),format.raw/*63.81*/(""""></script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*64.42*/routes/*64.48*/.Assets.at("javascript/router.js"))),format.raw/*64.82*/(""""></script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*65.42*/routes/*65.48*/.Assets.at("javascript/event.js"))),format.raw/*65.81*/(""""></script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*66.42*/routes/*66.48*/.Assets.at("javascript/view.js"))),format.raw/*66.80*/(""""></script>
</body>
</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jul 06 09:25:26 JST 2014
                    SOURCE: C:/Users/machi_000/workspace/hello-play-backbone/app/views/index.scala.html
                    HASH: f59421c9ae7ee25fe27636740cf9f70b92e7781b
                    MATRIX: 637->0|732->60|746->66|823->122|891->155|905->161|953->188|2215->1414|2230->1420|2299->1467|2388->1520|2403->1526|2481->1581|2570->1634|2585->1640|2658->1691|2747->1744|2762->1750|2807->1773|2896->1826|2911->1832|2955->1854|3044->1907|3059->1913|3136->1967|3250->2045|3265->2051|3320->2084|3409->2137|3424->2143|3479->2176|3568->2229|3583->2235|3639->2269|3728->2322|3743->2328|3798->2361|3887->2414|3902->2420|3956->2452
                    LINES: 22->1|25->4|25->4|25->4|26->5|26->5|26->5|76->55|76->55|76->55|77->56|77->56|77->56|78->57|78->57|78->57|79->58|79->58|79->58|80->59|80->59|80->59|81->60|81->60|81->60|83->62|83->62|83->62|84->63|84->63|84->63|85->64|85->64|85->64|86->65|86->65|86->65|87->66|87->66|87->66
                    -- GENERATED --
                */
            